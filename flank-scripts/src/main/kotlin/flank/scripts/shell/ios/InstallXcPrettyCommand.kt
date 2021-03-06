package flank.scripts.shell.ios

import com.github.ajalt.clikt.core.CliktCommand
import flank.scripts.shell.utils.failIfWindows
import flank.scripts.utils.downloadXcPrettyIfNeeded

object InstallXcPrettyCommand : CliktCommand(name = "install_xcpretty", help = "Build ios app with tests") {
    override fun run() {
        failIfWindows()
        downloadXcPrettyIfNeeded()
    }
}
