import 'package:flutter/material.dart';
import 'package:flutter_module/search/rubbish_list_page.dart';

class SearchPage extends StatefulWidget {
  const SearchPage({super.key});

  @override
  State<SearchPage> createState() => _SearchPageState();
}

class _SearchPageState extends State<SearchPage> {
  final TextEditingController _textController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Column(
        children: [searchView(), RubbishListPage(_textController.text.trim())],
      ),
    );
  }

  Container searchView() {
    return Container(
      decoration: BoxDecoration(
          borderRadius: const BorderRadius.all(Radius.circular(30)),
          border: Border.all(color: Colors.black54)),
      margin: const EdgeInsets.all(10),
      padding: const EdgeInsets.fromLTRB(10, 0, 10, 0),
      child: Row(children: [
        Expanded(
          flex: 3,
          child: TextField(
            controller: _textController,
            decoration: const InputDecoration(
                hintText: "请输入食物",
                border: InputBorder.none,
                prefixIcon: Icon(Icons.search)),
          ),
        ),
        Expanded(
          flex: 1,
          child: OutlinedButton(
              onPressed: () {
                setState(() {

                });
              },
              child: const Text(
                "搜索",
                style: TextStyle(color: Colors.black54),
              )),
        )
      ]),
    );
  }
}
