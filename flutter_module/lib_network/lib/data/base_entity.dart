import 'package:json_annotation/json_annotation.dart';

part 'base_entity.g.dart';

@JsonSerializable(genericArgumentFactories: true)
class BaseEntity<T> {
  final int code;
  final String msg;
  final T? result;

  BaseEntity({required this.code, required this.msg, this.result});

  factory BaseEntity.fromJson(
          Map<String, dynamic> json, T Function(dynamic json) fromJsonT) =>
      _$BaseEntityFromJson<T>(json, fromJsonT);

  Map<String, dynamic> toJson(Object? Function(T value) toJsonT) =>
      _$BaseEntityToJson<T>(this, toJsonT);
}
