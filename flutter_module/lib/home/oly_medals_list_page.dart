import 'package:flutter/material.dart';
import 'package:lib_network/api_service.dart';
import 'package:lib_network/data/oly_medals_entity.dart';

class OlyMedalsListPage extends StatefulWidget {
  const OlyMedalsListPage({super.key});

  @override
  State<OlyMedalsListPage> createState() => _OlyMedalsListPageState();
}

class _OlyMedalsListPageState extends State<OlyMedalsListPage> {
  final List<OlyMedalsMedalsList> olyMedalsEntity = [];

  @override
  void initState() {
    super.initState();
    getOlyMedalsList();
  }

  Future getOlyMedalsList() async {
    var olyMedalsData = await ApiService.withDio().getOlyMedals();
    if (mounted) {
      setState(() {
        olyMedalsEntity.clear();
        olyMedalsEntity.addAll(olyMedalsData.result?.medalsList ?? []);
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return SliverList.builder(
        itemCount: olyMedalsEntity.length,
        itemBuilder: (context, index) {
          return Container(
              color: Colors.grey,
              padding: const EdgeInsets.all(5.0),
              height: 100,
              child: Card(
                margin: const EdgeInsets.all(5.0),
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(10.0)),
                child: ListTile(
                  leading: const Icon(Icons.icecream_sharp),
                  title: Text(olyMedalsEntity[index].countryname ?? ""),
                  subtitle: Text(olyMedalsEntity[index].countryid ?? ""),
                  trailing: const Icon(Icons.calendar_today),
                ),
              ));
        });
  }
}
