

object Rek {
	
	// Run With:
	
	// scala> Rek("[a,[a],a,[[],a]]")
	// res0: Boolean = true
	
	// scala> Rek("[a,[a],,a,[[],a]]")
	// res1: Boolean = false
	
	// scala> Rek.test
	// res2: Boolean = true
	
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
		val ns = List( "[", "a]", "[a,[a,a]],a]", "[a,[a,a],a,]", "[[]],a]", "[[[]a],a]" )
		val fst = ys forall { x => Rek(x) }
		val snd = ns forall { x => ! Rek(x) }
		fst && snd
	}
	
	// LIST 	-> '[' ELEMS ']'
	def LIST:Boolean = () match {
		case _ => match_('[') && ELEMS && match_(']')
	}
	
	// ELEMS 	-> (ELEM (',' ELEM)*)?
	def ELEMS:Boolean = () match {
		case _ if ELEM => {	// parse a single element then the other elements
							while ( match_(',')) {
								if (!ELEM) return pfalse("ELEM failed")
							}
							true
						  }
		case _ => true		// or parse no elements
	}
	
	// ELEM 	-> 'a' | LIST
	def ELEM:Boolean = () match {
		case _ => match_('a') || LIST
	}
	
	def pfalse(s:String):Boolean = { if (verbose) println(s); false }
	
	def match_(c:Char):Boolean = () match {
		case _ if word == "" => pfalse("Expected "+c+" but got EOF")
		case _ if c == word.head => {
						word = word.tail
						if (verbose) println("Scan: " + word)
						true
					}
		case _ => pfalse("Expected "+c+" but got "+word.head)
	}
	
}

