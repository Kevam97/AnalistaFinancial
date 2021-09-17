# Autor: Kevin Valencia Marín
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

    @scenario
    Scenario Outline: Search for a automation course
      Given  than brandon wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the course  on the choucair academy plataform
        | strCourse   |
        | <strCourse> |
      Then he finds the course called
        | strCourse   |
        | <strCourse> |

      Examples:
        | strUser    | strPassword  | strCourse                 |
        | 1088344857 | Choucair2021*| Patrones de Automatización|