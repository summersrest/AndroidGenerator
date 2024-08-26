package generator.mvp.refresh_activity.template.kotlin

import generator.util.*


/**
 * @author  LiuJiang
 * created  at: 2023/2/2 17:13
 * Desc:
 */
fun refreshModelTemp(
    applicationPackage: String?,
    packageName: String,
    modelName: String,
    desc: String
) = """
        package ${packageName}.${MODEL_PATH}

        import com.sum.frame.mvp.BaseModel

        /**
         * @author  LiuJiang
         * created  at: ${time()}
         * Desc:    $desc
         */
        class ${modelName}(tag: Any?) : BaseModel(tag) {

        }
""".trimIndent()