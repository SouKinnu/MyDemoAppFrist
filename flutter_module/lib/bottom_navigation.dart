import 'package:flutter/material.dart';
import 'package:flutter_module/my/my_page.dart';
import 'package:flutter_module/search/search_page.dart';

import 'home/home_page.dart';

class BottomNavigation extends StatefulWidget {
  const BottomNavigation({super.key});

  @override
  State<BottomNavigation> createState() => _BottomNavigationState();
}

class _BottomNavigationState extends State<BottomNavigation> {
  static final List<_BottomMenuItem> bottomTabItems = [
    const _BottomMenuItem(
        label: '首页', icon: 'images/home.png', child: HomePage()),
    const _BottomMenuItem(
        label: '搜索', icon: 'images/search.png', child: SearchPage()),
    const _BottomMenuItem(label: '我的', icon: 'images/my.png', child: MyPage())
  ];

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
        length: bottomTabItems.length,
        child: Scaffold(
            body: SafeArea(
                child: TabBarView(
              physics: const NeverScrollableScrollPhysics(),
              children: bottomTabItems.map((e) => e.child).toList(),
            )),
            bottomNavigationBar: TabBar(
              tabs: bottomTabItems
                  .map((e) => Tab(
                        icon: Image.asset(e.icon,scale:4,),
                        text: e.label,
                      ))
                  .toList(),
            )));
  }
}

class _BottomMenuItem {
  final String label;
  final String icon;
  final Widget child;

  const _BottomMenuItem(
      {required this.label, required this.icon, required this.child});
}
