package generator.mvp.simple_fragment.template.kotlin

import generator.util.MODEL_PATH
import generator.util.time


/**
 * @author  LiuJiang
 * Desc:    Mvp model Fragment 模板
 */
fun mvpFragModel (
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