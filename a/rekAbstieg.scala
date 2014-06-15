

object Rek {
	
	var word = ""
	
	val a = 'a'
	val b = 'b'
	
	def apply(word2:String):Boolean = {
		word = word2
		val ret = S && word == ""
		word = ""
		ret
	}
	
	
	def test():Boolean = {
		val ys = List( "ab", "abba", "bbaa", "bbabaa" )
		val ns = List( "", "a", "abbaf", "bbaaa", "bbabbaa" )
		val fst = ys forall { x => Rek(x) }
		val snd = ns forall { x => ! Rek(x) }
		fst && snd
	}
	
	def S:Boolean = () match {
		case _ if match_(a) => B
		case _ if match_(b) => A
		case _ => false
	}
	
	def A:Boolean = () match {
		case _ if match_(a) => S || true
		case _ if match_(b) => A && A
		case _ => false
	}
	
	def B:Boolean = () match {
		case _ if match_(b) => S || true
		case _ if match_(a) => B && B
		case _ => false
	}
	
	def match_(c:Char):Boolean = () match {
		case _ if word == "" => false
		case _ if c == word.head => { word = word.tail; println(word); true }
		case _ => false
	}
	/*
	
	S -> aB | bA
	A -> a[S] | bAA
	B -> b[S] | aBB
	
	*/
	
}

