import 'package:dio/dio.dart';

class DioClient {
  static BaseOptions baseOptions = BaseOptions(
      connectTimeout: const Duration(seconds: 5000),
      receiveTimeout: const Duration(seconds: 30000),
      contentType: "application/json");

  late Dio _dio;

  Dio get dio => _dio;

  DioClient._internal() {
    _dio = Dio(baseOptions);
  }

  static final DioClient _client = DioClient._internal();

  factory DioClient() => _client;
}

DioClient dioClient = DioClient();
