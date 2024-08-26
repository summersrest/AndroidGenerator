package generator.mvp.simple_activity.template.kotlin

import generator.util.*

/**
 * @author  LiuJiang
 * Desc:    Mvp Activity模板
 */
fun mvpActivityTemp(
    applicationPackage: String?,
    packageName: String,
    activityClass: String,
    presenterName: String,
    viewName: String,
    desc: String
) = """
    package ${packageName}.${ACTIVITY_PATH}

    import android.os.Bundle
    import ${packageName}.${PRESENTER_PATH}.$presenterName
    import ${packageName}.${VIEW_PATH}.$viewName
    import ${applicationPackage}.databinding.Activity${activityClass}Binding
    import com.sum.frame.mvp.BaseMvpActivity

    /**
     * @author  LiuJiang
     * created  at: ${time()}
     * Desc:    $desc
     */
    class ${activityClass}Activity : BaseMvpActivity<Activity${activityClass}Binding, ${presenterName}>(), $viewName {
    
        override fun createPresenter() = ${presenterName}(this, this)

        override fun initView(savedInstanceState: Bundle?) {
            
        }


    }
""".trimIndent()