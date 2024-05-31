// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'rubbish_entity.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

RubbishEntity _$RubbishEntityFromJson(Map<String, dynamic> json) =>
    RubbishEntity()
      ..name = json['name'] as String?
      ..type = (json['type'] as num?)?.toDouble()
      ..aipre = (json['aipre'] as num?)?.toDouble()
      ..explain = json['explain'] as String?
      ..contain = json['contain'] as String?
      ..tip = json['tip'] as String?;

Map<String, dynamic> _$RubbishEntityToJson(RubbishEntity instance) =>
    <String, dynamic>{
      'name': instance.name,
      'type': instance.type,
      'aipre': instance.aipre,
      'explain': instance.explain,
      'contain': instance.contain,
      'tip': instance.tip,
    };
