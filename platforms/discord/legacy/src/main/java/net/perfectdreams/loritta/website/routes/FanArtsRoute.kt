package net.perfectdreams.loritta.website.routes

import io.ktor.application.*
import net.perfectdreams.loritta.common.locale.BaseLocale
import net.perfectdreams.loritta.platform.discord.LorittaDiscord
import net.perfectdreams.loritta.website.utils.extensions.redirect

class FanArtsRoute(loritta: LorittaDiscord) : LocalizedRoute(loritta, "/fanarts") {
    override val isMainClusterOnlyRoute = true

    override suspend fun onLocalizedRequest(call: ApplicationCall, locale: BaseLocale) {
        redirect("https://fanarts.perfectdreams.net/", true)
    }
}