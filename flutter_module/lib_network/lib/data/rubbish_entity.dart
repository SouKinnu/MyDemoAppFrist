import 'package:json_annotation/json_annotation.dart';

part 'rubbish_entity.g.dart';

@JsonSerializable()
class RubbishEntity {
  String? name;
  double? type;
  double? aipre;
  String? explain;
  String? contain;
  String? tip;

  RubbishEntity();

  factory RubbishEntity.fromJson(Map<String, dynamic> json) =>
      _$RubbishEntityFromJson(json);

  Map<String, dynamic> toJson() => _$RubbishEntityToJson(this);
}
