import 'package:json_annotation/json_annotation.dart';

part 'mi_you_entity.g.dart';

@JsonSerializable()
class MiYouEntity {
	int? id;
	String? name;
	int? num;
	int? sortOrder;
	String? icon;
	String? status;
	List<MiYouList>? list;
	String? type;

	MiYouEntity();

	factory MiYouEntity.fromJson(Map<String, dynamic> json) => _$MiYouEntityFromJson(json);

	Map<String, dynamic> toJson() => _$MiYouEntityToJson(this);

}

@JsonSerializable()
class MiYouList {
	int? id;
	String? name;
	String? icon;
	int? sortOrder;
	String? status;

	MiYouList();

	factory MiYouList.fromJson(Map<String, dynamic> json) => _$MiYouListFromJson(json);

	Map<String, dynamic> toJson() => _$MiYouListToJson(this);
}