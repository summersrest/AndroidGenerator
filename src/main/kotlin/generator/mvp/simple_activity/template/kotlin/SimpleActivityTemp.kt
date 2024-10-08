package generator.mvp.simple_activity.template.kotlin

import generator.util.*


/**
 * @author  LiuJiang
 * Desc:    简单的Activity模板
 */
fun simpleActivityTemp(
    applicationPackage: String?,
    packageName: String,
    activityClass: String,
    desc: String
) = """
    package $packageName
    
    import android.os.Bundle
    import com.sum.frame.mvp.BaseMvpActivity
    import ${applicationPackage}.databinding.Activity${activityClass}Binding
    
    /**
     * @author  LiuJiang
     * created  at: ${time()}
     * Desc:    $desc
     */
    class ${activityClass}Activity: BaseActivity<Activity${activityClass}Binding>() {
    
        override fun initView(savedInstanceState: Bundle?) {
        
        }
    }
"""