package result

class Failure(val errorMessage: String) : Result {

    fun getErrorMessage(): String {
        return errorMessage
    }
}