// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'oly_medals_entity.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

OlyMedalsEntity _$OlyMedalsEntityFromJson(Map<String, dynamic> json) =>
    OlyMedalsEntity()
      ..total = (json['total'] as num?)?.toInt()
      ..medalsList = (json['medalsList'] as List<dynamic>?)
          ?.map((e) => OlyMedalsMedalsList.fromJson(e as Map<String, dynamic>))
          .toList();

Map<String, dynamic> _$OlyMedalsEntityToJson(OlyMedalsEntity instance) =>
    <String, dynamic>{
      'total': instance.total,
      'medalsList': instance.medalsList,
    };

OlyMedalsMedalsList _$OlyMedalsMedalsListFromJson(Map<String, dynamic> json) =>
    OlyMedalsMedalsList()
      ..bronze = json['bronze'] as String?
      ..rank = json['rank'] as String?
      ..count = json['count'] as String?
      ..silver = json['silver'] as String?
      ..countryname = json['countryname'] as String?
      ..gold = json['gold'] as String?
      ..countryid = json['countryid'] as String?;

Map<String, dynamic> _$OlyMedalsMedalsListToJson(
        OlyMedalsMedalsList instance) =>
    <String, dynamic>{
      'bronze': instance.bronze,
      'rank': instance.rank,
      'count': instance.count,
      'silver': instance.silver,
      'countryname': instance.countryname,
      'gold': instance.gold,
      'countryid': instance.countryid,
    };
