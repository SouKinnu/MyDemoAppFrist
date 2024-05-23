import 'package:json_annotation/json_annotation.dart';

part 'bing_image_entity.g.dart';

@JsonSerializable()
class BingImageEntity {
  String? copyright;
  String? copyrightlink;
  String? title;
  String? url;
  String? date;

  BingImageEntity();

  factory BingImageEntity.fromJson(Map<String, dynamic> json) =>
      _$BingImageEntityFromJson(json);

  Map<String, dynamic> toJson() => _$BingImageEntityToJson(this);
}
