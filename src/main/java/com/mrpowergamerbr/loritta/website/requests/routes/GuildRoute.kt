package com.mrpowergamerbr.loritta.website.requests.routes

import com.mrpowergamerbr.loritta.website.requests.routes.page.guild.configure.ConfigureEconomyController
import com.mrpowergamerbr.loritta.website.requests.routes.page.guild.configure.ConfigureMiscellaneousController
import org.jooby.Jooby

class GuildRoute : Jooby() {
	init {
		use(ConfigureEconomyController::class.java)
		use(ConfigureMiscellaneousController::class.java)
	}
}