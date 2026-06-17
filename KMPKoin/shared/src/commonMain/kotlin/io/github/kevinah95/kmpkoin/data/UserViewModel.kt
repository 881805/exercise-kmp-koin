package io.github.kevinah95.kmpkoin.data

class UserViewModel(
    private val userRepository: UserRepository
) {

    fun getGreeting(): String {
        return "Hello, ${userRepository.getUsers().firstOrNull()?.name ?: "Guest"}!"
    }

    fun getUsers() = userRepository.getUsers()
}