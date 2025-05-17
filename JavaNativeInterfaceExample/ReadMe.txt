Использование JNI (Java Native Interface):
1. Установить MinGW-w64. При установке выбрать x86-64 и прописать bin переменные среды path.

2. Создать Lib.java с native-методами.

3. Перейти в консоли в папку (ex: src), в которую хотите сохранить сгенерированные файлы.

4. Выполнить javac -h . AwesomeLib.java.

5. Выполнить g++ -c -I"C:\\Program Files\\Java\\jdk-12.0.1\\include" -I"C:\\Program Files\\Java\\jdk-12.0.1\\include\\win32" AwesomeLib.cpp -o AwesomeLib.o.

6. Выполнить g++ -shared -o nativeLib.dll AwesomeLib.o -Wl,--add-stdcall-alias.

7. Запустить программу: java -cp . -Djava.library.path=”Путь до папки с .dll" *файл, который хотите запустить*