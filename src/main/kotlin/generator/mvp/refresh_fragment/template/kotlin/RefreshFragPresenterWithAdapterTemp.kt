package generator.mvp.refresh_fragment.template.kotlin

import generator.util.*
import generator.util.time

/**
 * @author  LiuJiang
 * Desc:
 */
fun refreshFragPresenterWithAdapterTemp (
    applicationPackage: String?,
    packageName: String,
    presenterName: String,
    modelName: String,
    viewName: String,
    desc: String,
    beanName: String,
) = """
    package ${packageName}.${PRESENTER_PATH}

    import ${packageName}.${MODEL_PATH}.$modelName
    import ${packageName}.${VIEW_PATH}.$viewName
    import com.sum.frame.mvp.BasePresenter

    /**
     * @author  LiuJiang
     * created  at: ${time()}
     * Desc:    $desc
     */
    class ${presenterName}(listener: ${viewName}, fragment: Fragment?): BasePresenter<${modelName}, ${viewName}>(listener, fragment) {
        var page = 1;
        var data = mutableListOf<$beanName>()

        override fun createModel() = ${modelName}(tag)



    }
""".trimIndent()