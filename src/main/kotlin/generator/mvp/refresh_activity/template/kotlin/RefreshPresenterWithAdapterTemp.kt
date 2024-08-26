package generator.mvp.refresh_activity.template.kotlin

import generator.util.*
import generator.util.time

/**
 * @author  LiuJiang
 * Desc:
 */
fun refreshPresenterWithAdapterTemp (
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
    import ${applicationPackage}.$APP_PATH.$BEAN_PATH.$beanName

    /**
     * @author  LiuJiang
     * created  at: ${time()}
     * Desc:    $desc
     */
    class ${presenterName}(tag: Any?, view: ${viewName}) : BasePresenter<${modelName}, ${viewName}>(tag, view) {
    
        override fun createModel() = ${modelName}(tag)

        var page = 1;
        var data = mutableListOf<$beanName>()


    }
""".trimIndent()