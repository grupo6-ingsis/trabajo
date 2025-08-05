package result

interface Result {
    fun isValid(): Boolean{
        return this is Valid
    }
}