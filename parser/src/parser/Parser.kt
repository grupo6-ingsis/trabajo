package parser

import AbstractSyntaxTree
import lexer.Token

interface Parser {
    fun parse(input: Token): AbstractSyntaxTree
}