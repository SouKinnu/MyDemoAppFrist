import groovy.lang.Binding
import groovy.lang.Script
import java.net.URI

include(":lib_http")


include(":lib_base")


pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = URI("https://maven.aliyun.com/repository/public/")
        }
        maven {
            url = URI("https://maven.aliyun.com/repository/google")
        }
        maven {
            url = URI("https://maven.aliyun.com/repository/central")
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "MyDemoAppFirst"
include(":app")
/*object : Script() {
    override fun setBinding(binding: Binding?) {
        super.setBinding(Binding(mapOf(gradle to this)))
    }

    override fun run(): Any {

    }

    override fun evaluate(file: File?): Any {
        return super.evaluate(
            File(
                settingsDir.parentFile,
                "MyDemoAppFirst/flutter_module/.android/include_flutter.groovy"
            )
        )
    }
}
include(":flutter_module")*/





