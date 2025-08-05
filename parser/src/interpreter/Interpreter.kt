package interpreter

import AbstractSyntaxTree

interface Interpreter {
    fun interpret(ast: AbstractSyntaxTree): Any
}