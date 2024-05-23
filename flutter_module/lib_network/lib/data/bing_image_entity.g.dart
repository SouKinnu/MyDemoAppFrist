// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'bing_image_entity.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

BingImageEntity _$BingImageEntityFromJson(Map<String, dynamic> json) =>
    BingImageEntity()
      ..copyright = json['copyright'] as String?
      ..copyrightlink = json['copyrightlink'] as String?
      ..title = json['title'] as String?
      ..url = json['url'] as String?
      ..date = json['date'] as String?;

Map<String, dynamic> _$BingImageEntityToJson(BingImageEntity instance) =>
    <String, dynamic>{
      'copyright': instance.copyright,
      'copyrightlink': instance.copyrightlink,
      'title': instance.title,
      'url': instance.url,
      'date': instance.date,
    };
