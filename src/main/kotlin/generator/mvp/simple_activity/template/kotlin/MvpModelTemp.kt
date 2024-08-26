package generator.mvp.simple_activity.template.kotlin

import generator.util.*

/**
 * @author  LiuJiang
 * Desc:    Mvp model 模板
 */
fun mvpModelTemp (
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