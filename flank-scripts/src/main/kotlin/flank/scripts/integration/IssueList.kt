package flank.scripts.integration

import com.github.kittinunf.result.getOrElse
import com.github.kittinunf.result.onError
import flank.scripts.github.getGitHubIssueList

suspend fun checkForOpenedITIssues(token: String): Int? = getGitHubIssueList(
    githubToken = token,
    parameters = listOf(
        "creator" to "github-actions[bot]",
        "state" to "open",
        "labels" to "IT_Failed"
    )
)
    .onError { println(it.message) }
    .getOrElse { emptyList() }
    .firstOrNull()
    .also {
        if (it != null) println("** Issue found: ${it.htmlUrl}")
        else println("** No opened issue")
    }?.number
