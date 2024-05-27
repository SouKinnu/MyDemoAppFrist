import 'package:cached_network_image/cached_network_image.dart';
import 'package:card_swiper/card_swiper.dart';
import 'package:flutter/material.dart';
import 'package:lib_network/data/bing_image_entity.dart';
import 'package:lib_network/lib_network.dart';

import 'oly_medals_list_page.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  final List<BingImageEntity> bingImageEntity = [];

  @override
  void initState() {
    super.initState();
    _loadBanner();
  }

  Future _loadBanner() async {
    var bingImageData = await ApiService.withDio().getBanner();
    if (mounted) {
      setState(() {
        bingImageEntity.clear();
        bingImageEntity.addAll(bingImageData.result ?? []);
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
        child: CustomScrollView(slivers: [
      SliverAppBar(
        surfaceTintColor: Colors.white,
        pinned: true,
        floating: false,
        snap: false,
        expandedHeight: 150,
        flexibleSpace: FlexibleSpaceBar(
          background: _buildBanner(),
        ),
      ),
      const OlyMedalsListPage()
    ]));
  }

  Widget _buildBanner() {
    return AspectRatio(
        aspectRatio: 16 / 9,
        child: bingImageEntity.isEmpty
            ? Container()
            : Swiper(
                itemCount: bingImageEntity.length,
                autoplay: true,
                duration: 500,
                itemBuilder: (context, index) {
                  return CachedNetworkImage(
                      imageUrl: bingImageEntity[index].url ?? "",
                      fit: BoxFit.cover);
                }));
  }
}
