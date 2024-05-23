// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'base_entity.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

BaseEntity<T> _$BaseEntityFromJson<T>(
  Map<String, dynamic> json,
  T Function(Object? json) fromJsonT,
) =>
    BaseEntity<T>(
      message: json['message'] as String,
      status: json['status'] as String,
      result: _$nullableGenericFromJson(json['result'], fromJsonT),
    );

Map<String, dynamic> _$BaseEntityToJson<T>(
  BaseEntity<T> instance,
  Object? Function(T value) toJsonT,
) =>
    <String, dynamic>{
      'message': instance.message,
      'status': instance.status,
      'result': _$nullableGenericToJson(instance.result, toJsonT),
    };

T? _$nullableGenericFromJson<T>(
  Object? input,
  T Function(Object? json) fromJson,
) =>
    input == null ? null : fromJson(input);

Object? _$nullableGenericToJson<T>(
  T? input,
  Object? Function(T value) toJson,
) =>
    input == null ? null : toJson(input);
