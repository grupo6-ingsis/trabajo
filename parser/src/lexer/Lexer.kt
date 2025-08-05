package lexer

interface Lexer {
    fun lex(input: String): List<Token>
}