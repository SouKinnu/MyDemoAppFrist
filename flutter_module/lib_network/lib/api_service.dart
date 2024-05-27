import 'package:dio/dio.dart';
import 'package:lib_network/data/base_entity.dart';
import 'package:lib_network/data/bing_image_entity.dart';
import 'package:lib_network/data/rubbish_entity.dart';
import 'package:lib_network/dio_client.dart';
import 'package:retrofit/http.dart';
import 'package:retrofit/retrofit.dart';

import 'data/mi_you_entity.dart';
import 'data/oly_medals_entity.dart';

part 'api_service.g.dart';

@RestApi(baseUrl: 'https://api.oioweb.cn/')
abstract class ApiService {
  factory ApiService(Dio dio, {String baseUrl}) = _ApiService;

  factory ApiService.withDio() {
    return ApiService(dioClient.dio);
  }

  @GET('/api/bing')
  Future<BaseEntity<List<BingImageEntity>>> getBanner();

  @POST('/api/search/getOlyMedals')
  Future<BaseEntity<OlyMedalsEntity>> getOlyMedals();

  @GET('/api/picture/miyoushe_avatar')
  Future<BaseEntity<List<MiYouEntity>>> getMiYou();

  @GET('/api/common/rubbish')
  Future<BaseEntity<List<RubbishEntity>>> getRubbish(@Query("name") String name);
}
