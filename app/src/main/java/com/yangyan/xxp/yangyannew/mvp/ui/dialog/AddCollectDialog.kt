package com.yangyan.xxp.yangyannew.mvp.ui.dialog

import android.view.ViewGroup
import com.jess.arms.utils.ArmsUtils
import com.yangyan.xxp.yangyannew.R

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/27
 * Description : 添加收藏夹
 */
class AddCollectDialog :BaseDialogFragment(){
    override fun getResoureId(): Int  = R.layout.dialog_add_collect
    override fun onResume() {
        super.onResume()
        val dialogWindow = dialog.window
        val lp = dialogWindow!!.attributes
        lp.width = ArmsUtils.dip2px(context,282f)
        lp.height = ViewGroup.LayoutParams.WRAP_CONTENT
        dialogWindow.attributes = lp
    }

    companion object {
        fun newInstance() = AddCollectDialog()
    }

}