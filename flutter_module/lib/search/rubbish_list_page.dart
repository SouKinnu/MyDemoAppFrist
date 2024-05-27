import 'package:flutter/material.dart';
import 'package:lib_network/api_service.dart';
import 'package:lib_network/data/rubbish_entity.dart';

class RubbishListPage extends StatefulWidget {
  String name;

  RubbishListPage(this.name, {super.key});

  @override
  State<RubbishListPage> createState() => _RubbishListPageState();
}

class _RubbishListPageState extends State<RubbishListPage> {
  List<RubbishEntity> rubbishData = [];

  @override
  void initState() {
    super.initState();
    getRubbish();
  }

  Future getRubbish() async {
    var rubbishEntity = await ApiService.withDio().getRubbish(widget.name);
    if (mounted) {
      setState(() {
        rubbishData.clear();
        rubbishData.addAll(rubbishEntity.result ?? []);
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Expanded(
        child: ListView.builder(
            itemCount: rubbishData.length,
            itemBuilder: (context, index) {
              return Container(
                  margin: const EdgeInsets.all(5),
                  padding: const EdgeInsets.all(5),
                  height: 100,
                  child: ListTile(
                    leading: const Icon(Icons.cable),
                    title: Text(rubbishData[index].name ?? ""),
                    subtitle: Text(rubbishData[index].tip ?? ""),
                    trailing: const Icon(Icons.collections),
                  ));
            }));
  }
}
