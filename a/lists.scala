

object Rek {
	
	// Run With:
	
	// scala> Rek("[a,[a],a,[[],a]]")
	// res0: Boolean = true
	
	// scala> Rek.test
	// res1: Boolean = true
	
	var word = ""
	var verbose = false
	
	/*
	A grammar for lists containing lists or the element a.
	LIST 	-> '[' ELEMS ']'
	ELEMS 	-> (ELEM (',' ELEM)*)?
	ELEM 	-> 'a' | LIST
	*/
	
	def apply(word2:String, verbose2:Boolean = false):Boolean = {
		
		// save vars
		word = word2
		val oldVerbose = verbose
		verbose = verbose2
		
		// parse LIST. word should be completely parsed/matched
		val ret = LIST && word == ""
		
		// reset global vars
		word = ""
		verbose = oldVerbose
		
		// return success
		ret
	}
	
	
	def test():Boolean = {
		val ys = List( "[]", "[a]", "[[a,[a,a]],a]", "[[[]],a]" )
		val ns = List( "[", "a]", "[a,[a,a]],a,]", "[[]],a]", "[[[]a],a]" )
		val fst = ys forall { x => Rek(x) }
		val snd = ns forall { x => ! Rek(x) }
		fst && snd
	}
	
	def LIST:Boolean = () match {
		case _ if match_('[') => ELEMS && match_(']')
		case _ => false
	}
	
	def ELEMS:Boolean = () match {
		case _ => {
					ELEM && {
							var ret = true;
							while ( match_(',') ) {
								ret = ELEM
							}
							ret
						  }
					true
				  }
	}
	
	def ELEM:Boolean = () match {
		case _ => match_('a') || LIST
	}
	
	def match_(c:Char):Boolean = () match {
		case _ if word == "" => false
		case _ if c == word.head => {
						word = word.tail
						if (verbose) println(word)
						true
					}
		case _ => false
	}
	
}

