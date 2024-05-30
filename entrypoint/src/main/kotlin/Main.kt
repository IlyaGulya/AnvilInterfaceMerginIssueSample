fun main() {
    DaggerSomeComponent
        .create()
        .also {
            Dependencies.instance = it
        }
}