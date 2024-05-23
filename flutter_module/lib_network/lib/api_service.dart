import 'package:dio/dio.dart';
import 'package:lib_network/data/base_entity.dart';
import 'package:lib_network/data/bing_image_entity.dart';
import 'package:lib_network/dio_client.dart';
import 'package:retrofit/http.dart';

part 'api_service.g.dart';

@RestApi(baseUrl: 'https://api.oioweb.cn/')
abstract class ApiService {
  factory ApiService(Dio dio, {String baseUrl}) = _ApiService;

  factory ApiService.withDio() {
    return ApiService(dioClient.dio);
  }
  @GET('/api/bing')
  Future<BaseEntity<List<BingImageEntity>>> getBanner();
}
