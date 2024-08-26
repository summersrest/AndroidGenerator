package generator.mvp.simple_fragment.template.kotlin

import generator.util.*

/**
 * @author  LiuJiang
 * Desc:    Mvp Fragment 模板
 */
fun mvpFragmentTemp(
    applicationPackage: String?,
    packageName: String,
    fragmentClass: String,
    presenterName: String,
    viewName: String,
    desc: String
) = """
    package ${packageName}.${FRAGMENT_PATH}

    import ${packageName}.${PRESENTER_PATH}.$presenterName
    import ${packageName}.${VIEW_PATH}.$viewName
    import ${applicationPackage}.databinding.Fragment${fragmentClass}Binding
    import com.sum.frame.mvp.BaseMvpFragment

    /**
     * @author  LiuJiang
     * created  at: ${time()}
     * Desc:    $desc
     */
    class ${fragmentClass}Fragment: BaseMvpFragment<Fragment${fragmentClass}Binding, ${presenterName}>(), $viewName {
    
        override fun createPresenter() = ${presenterName}(this, this)

        override fun initView() {

        }
        
    }
""".trimIndent()