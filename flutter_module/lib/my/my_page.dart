import 'package:cached_network_image/cached_network_image.dart';
import 'package:flutter/material.dart';
import 'package:lib_network/api_service.dart';
import 'package:lib_network/data/mi_you_entity.dart';

class MyPage extends StatefulWidget {
  const MyPage({super.key});

  @override
  State<MyPage> createState() => _MyPageState();
}

class _MyPageState extends State<MyPage> {
  List<MiYouList> miYouList = [];

  Future getMiYou() async {
    var miYouEntity = await ApiService.withDio().getMiYou();
    if (mounted) {
      setState(() {
        miYouList.clear();
        miYouEntity.result?.map((e) {
          miYouList.add(MiYouList("TITLE", e.name ?? ""));
          e.list?.map((e) {
            miYouList.add(MiYouList("CONTENT", e));
          }).toList();
        }).toList();
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(child: ListView.builder(itemBuilder: (context, index) {
      return Container(
          padding: const EdgeInsets.all(5),
          margin: const EdgeInsets.all(5),
          child: miYouList[index].type == "TITLE" ? Container() : Container());
    }));
  }
}

class MiYouList {
  String type;
  Object data;

  MiYouList(this.type, this.data);
}
