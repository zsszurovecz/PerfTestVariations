package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class ExampleScalaSimulations extends Simulation {

  val testTimeSecs = 60
//  val token = System.getProperty("testedAppToken")
  val baseURL = System.getProperty("testedHost") + System.getProperty("testedPort")
  val requestName = "Example_request_against_demo_app"
  val scenarioName = requestName + "-scenario"
  val URI = "/api/greeting"
  val requestJSONBodyPath = "exampleSimulationBody.json"

  val httpConf = http
    .baseUrl(baseURL)
    .acceptHeader("application/json")
   // .authorizationHeader("Bearer " + token)

  val scn = scenario(scenarioName)
    .during(testTimeSecs) {
      exec(
        http(requestName)
          .post(baseURL + URI)
          .body(RawFileBody(requestJSONBodyPath)).asJson
          .check(status.is(200))
      ).exec { session =>
       // println("Actual token: " + token)
        println("Actual baseUrl and URI: " + baseURL+URI)
        session
      }
    }

  //https://gatling.io/docs/2.2/general/simulation_setup
  setUp(
    scn.inject(heavisideUsers(200) during (1 minutes)),
  ).protocols(httpConf)

}
