package db.migration

import org.flywaydb.core.api.migration.BaseJavaMigration
import org.flywaydb.core.api.migration.Context
import org.jooq.DSLContext
import org.jooq.impl.DSL
import org.jooq.impl.DSL.*
import java.time.LocalDate


class V0002__initial_import : BaseJavaMigration() {
    override fun migrate(context: Context?) {
        var dsl = using(context?.connection)
        dsl.insertInto(table("employee"), field("user_name"), field("birth_date"),
                field("first_name"), field("last_name"), field("gender"),
                field("hire_date"))
                .values("abc123", LocalDate.now().toString(), "abc", "def", "M",
                        LocalDate.now().toString())
                .execute()

    }
}