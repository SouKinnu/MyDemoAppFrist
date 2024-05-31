// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'mi_you_entity.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

MiYouEntity _$MiYouEntityFromJson(Map<String, dynamic> json) => MiYouEntity()
  ..id = (json['id'] as num?)?.toInt()
  ..name = json['name'] as String?
  ..num = (json['num'] as num?)?.toInt()
  ..sortOrder = (json['sortOrder'] as num?)?.toInt()
  ..icon = json['icon'] as String?
  ..status = json['status'] as String?
  ..list = (json['list'] as List<dynamic>?)
      ?.map((e) => MiYouList.fromJson(e as Map<String, dynamic>))
      .toList()
  ..type = json['type'] as String?;

Map<String, dynamic> _$MiYouEntityToJson(MiYouEntity instance) =>
    <String, dynamic>{
      'id': instance.id,
      'name': instance.name,
      'num': instance.num,
      'sortOrder': instance.sortOrder,
      'icon': instance.icon,
      'status': instance.status,
      'list': instance.list,
      'type': instance.type,
    };

MiYouList _$MiYouListFromJson(Map<String, dynamic> json) => MiYouList()
  ..id = (json['id'] as num?)?.toInt()
  ..name = json['name'] as String?
  ..icon = json['icon'] as String?
  ..sortOrder = (json['sortOrder'] as num?)?.toInt()
  ..status = json['status'] as String?;

Map<String, dynamic> _$MiYouListToJson(MiYouList instance) => <String, dynamic>{
      'id': instance.id,
      'name': instance.name,
      'icon': instance.icon,
      'sortOrder': instance.sortOrder,
      'status': instance.status,
    };
