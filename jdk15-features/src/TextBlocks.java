public class TextBlocks {
//
//    - Text Blocks
//    Text blocks are finally a standard feature in Java 15. A text block is a multi-line string literal.
//    While using text blocks, we do not need to provide explicit line terminators, string concatenations,
//    and delimiters otherwise used for writing the normal string literals.

    String example = """
   Example text
""";
    String json = """
  {
   "name": "abc",
   "age":2
  },
  {
   "name": "xyz",
   "age":23
  }
 """;
    String dbSchema =   """
   CREATE TABLE 'TEST'.'EMPLOYEE'(
        'ID' INT NOT NULL DEFAULT 0 ,
        'FIRST_NAME' VARCHAR(100) NOT NULL ,
        'LAST_NAME' VARCHAR(100) NULL ,
        'STAT_CD' TINYINT NOT NULL DEFAULT 0);
""";
}
