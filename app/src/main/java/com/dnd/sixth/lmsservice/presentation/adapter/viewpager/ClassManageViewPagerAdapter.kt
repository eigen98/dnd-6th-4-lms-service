package com.dnd.sixth.lmsservice.presentation.adapter.viewpager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dnd.sixth.lmsservice.presentation.main.schedule.calendar.ClassCalendarFragment
import com.dnd.sixth.lmsservice.presentation.main.schedule.calendar.ClassManageActivity

class ClassManageViewPagerAdapter(activity: ClassManageActivity) : FragmentStateAdapter(activity) {

    // ViewPager2에 연결할 Fragment 생성
    private val fragmentList = listOf<Fragment>(ClassCalendarFragment(), ClassCalendarFragment(), ClassCalendarFragment())

    // ViesPager2에서 노출시킬 Fragment 개수 설정
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    // ViewPager2의 각 페이지에서 노출할 Fragment 설정
    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}