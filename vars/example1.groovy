def call(String name = "Alice") {
    script {
        sh """
            echo Hi commander ${name}
        """
    }
}
