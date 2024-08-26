package generator.mvp.simple_activity.template.kotlin

import generator.util.*

/**
 * @author  LiuJiang
 * Desc:    mvp view 模板
 */
fun mvpViewTemp(
    applicationPackage: String?,
    packageName: String,
    viewName: String,
    desc: String
) = """
    package ${packageName}.${VIEW_PATH}

    import com.sum.frame.mvp.BaseView

    /**
     * @author  LiuJiang
     * created  at: ${time()}
     * Desc:    $desc
     */
    interface $viewName : BaseView {
    
    }
""".trimIndent()