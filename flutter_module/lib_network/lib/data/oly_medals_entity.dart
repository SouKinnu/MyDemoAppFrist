import 'package:json_annotation/json_annotation.dart';

part 'oly_medals_entity.g.dart';

@JsonSerializable()
class OlyMedalsEntity {
  int? total;
  List<OlyMedalsMedalsList>? medalsList;

  OlyMedalsEntity();

  factory OlyMedalsEntity.fromJson(Map<String, dynamic> json) =>
      _$OlyMedalsEntityFromJson(json);

  Map<String, dynamic> toJson() => _$OlyMedalsEntityToJson(this);

}

@JsonSerializable()
class OlyMedalsMedalsList {
  String? bronze;
  String? rank;
  String? count;
  String? silver;
  String? countryname;
  String? gold;
  String? countryid;

  OlyMedalsMedalsList();

  factory OlyMedalsMedalsList.fromJson(Map<String, dynamic> json) =>
      _$OlyMedalsMedalsListFromJson(json);

  Map<String, dynamic> toJson() => _$OlyMedalsMedalsListToJson(this);
}
