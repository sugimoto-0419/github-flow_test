import 'dart:io';
import 'dart:convert';
import 'dart:async';

void main() async {
  print('こんにちは、名前はなんですか?');
  stdout.write('名前を入力:');

  Stream lines = stdin.transform(utf8.decoder).transform(const LineSplitter());

  await for (var line in lines) {
    print('こんにちは、${line}さん');
    break;
  }
}
