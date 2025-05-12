Инструкция, как собрать проект на Maven:

1. Создаём проект
2. В нём создаём директорию src/main/java/*название пакета*/*файлы*
3. Создаём файл pom.xml
4. Переходим в cmd:
	1. mvn --version (проверка того, что Maven установлен)
	2. cd *папка с проектом*
	3. mvn compile
	4. mvn exec:java -Dexec.mainClass="com.example.HelloWorld"
5. Проект собран!