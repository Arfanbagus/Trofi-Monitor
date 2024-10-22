package trpl.nim234311033.trofimonitor

data class club(
    val name: String,
    val premierLeague: Int,
    val faCup: Int,
    val eflCup: Int,
    val championsLeague: Int,
    val europaLeague: Int
) {
    val totalTrophies: Int
        get() = premierLeague + faCup + eflCup + championsLeague +
                europaLeague
}
