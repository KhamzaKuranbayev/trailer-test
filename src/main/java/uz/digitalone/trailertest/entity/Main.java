package uz.digitalone.trailertest.entity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        String str = "{\n" +
                "    \"data\": [\n" +

                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"824749229\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 33.413032,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 9381,\n" +
                "                        \"name\": \"PHX5\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"10 days 05 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 12:00:49\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8993,\n" +
                "                        \"name\": \"GYR3\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1234224PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -112.420322,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 12:00:49\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 99.0,\n" +
                "                \"location\": \"W Commerce Dr, Goodyear, AZ 85338, USA\",\n" +
                "                \"trailerId\": 24520,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/824749229/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/824749229/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"24520\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/824749229\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846862160\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 37.459221,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 9005,\n" +
                "                        \"name\": \"HRC9\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-09-2021 01:36:10\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 9358,\n" +
                "                        \"name\": \"Walmart Sutherland - WALSUT01\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8576,\n" +
                "                        \"name\": \"Sandston, VA (C022)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9149,\n" +
                "                        \"name\": \"RIC3\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1830539PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -77.430516,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Departure\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-09-2021 01:45:32\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 99.0,\n" +
                "                \"location\": \"2000 Trenton Ave, Richmond, VA 23234, USA\",\n" +
                "                \"trailerId\": 26722,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846862160/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846862160/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"26722\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846862160\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846862115\",\n" +
                "            \"attributes\": {\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 36.238934,\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"powerSource\": \"Solar\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 16:00:40\",\n" +
                "                \"trailerTires\": [],\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8284,\n" +
                "                        \"name\": \"LaVergne, TN (C113)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8264,\n" +
                "                        \"name\": \"LaVergne, TN (C118-ROC)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8278,\n" +
                "                        \"name\": \"BNA - Forward Air (5774)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8483,\n" +
                "                        \"name\": \"UPS TN\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8249,\n" +
                "                        \"name\": \"Nashville, TN (C102)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9174,\n" +
                "                        \"name\": \"Electrolux Major Appliances - ELESPR\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 16:00:40\"\n" +
                "                },\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1537092PLA\",\n" +
                "                \"batteryPercentage\": 100.0,\n" +
                "                \"location\": \"TN-155, Nashville, TN 37207, USA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"trailerId\": 28514,\n" +
                "                \"trailerState\": \"Stopped\",\n" +
                "                \"longitude\": -86.791003\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846862115/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846862115/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"28514\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846862115\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846870954\",\n" +
                "            \"attributes\": {\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 35.066883,\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 08:00:49\",\n" +
                "                \"trailerTires\": [],\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8225,\n" +
                "                        \"name\": \"Cleveland, TN (C005)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8424,\n" +
                "                        \"name\": \"RCT Terminal Cleveland - RCTCLE\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8430,\n" +
                "                        \"name\": \"COCCLE01\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8778,\n" +
                "                        \"name\": \"CCR - 904CHA\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 08:00:49\"\n" +
                "                },\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1536548PLA\",\n" +
                "                \"batteryPercentage\": 96.0,\n" +
                "                \"location\": \"3029 Silverdale Rd, Chattanooga, TN 37421, USA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"trailerId\": 21816,\n" +
                "                \"trailerState\": \"Stopped\",\n" +
                "                \"longitude\": -85.137357\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846870954/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846870954/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"21816\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846870954\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"824749337\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 43.603043,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 8749,\n" +
                "                        \"name\": \"BOI2\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"1 days 12 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 08:00:33\",\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1234186PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -116.494943,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 08:00:33\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 97.0,\n" +
                "                \"location\": \"15948 Robinson Rd, Nampa, ID 83687, USA\",\n" +
                "                \"trailerId\": 24225,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/824749337/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/824749337/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"24225\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/824749337\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"817385190\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 41.650142,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-09-2021 04:35:38\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 9205,\n" +
                "                        \"name\": \"Harvey Pallets\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9321,\n" +
                "                        \"name\": \"PTL Des Moines IA\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9322,\n" +
                "                        \"name\": \"DAFG IA (SQDM)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9226,\n" +
                "                        \"name\": \"SHOP\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"roadReadyDate\": \"01-01-2021 21:00:09\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1435982PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -93.658771,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-09-2021 04:42:26\"\n" +
                "                },\n" +
                "                \"roadReadyStatus\": \"PASS\",\n" +
                "                \"batteryPercentage\": 99.0,\n" +
                "                \"location\": \"I-35, Des Moines, IA 50313, USA\",\n" +
                "                \"trailerId\": 23756,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/817385190/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/817385190/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"23756\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/817385190\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"817385342\",\n" +
                "            \"attributes\": {\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 41.543996,\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-09-2021 04:40:08\",\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-09-2021 04:55:14\"\n" +
                "                },\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1435983PLA\",\n" +
                "                \"batteryPercentage\": 99.0,\n" +
                "                \"location\": \"WY-374, Little America, WY 82929, USA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"trailerId\": 24165,\n" +
                "                \"trailerState\": \"Stopped\",\n" +
                "                \"longitude\": -109.854038\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/817385342/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/817385342/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"24165\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/817385342\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"824747790\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 43.60271,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 8749,\n" +
                "                        \"name\": \"BOI2\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"3 days 08 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 12:00:31\",\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1537482PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -116.494654,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 12:00:31\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 99.0,\n" +
                "                \"location\": \"15948 Robinson Rd, Nampa, ID 83687, USA\",\n" +
                "                \"trailerId\": 19696,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/824747790/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/824747790/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"19696\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/824747790\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"817385222\",\n" +
                "            \"attributes\": {\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 39.234844,\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"powerSource\": \"Solar\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 20:45:25\",\n" +
                "                \"trailerTires\": [],\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8331,\n" +
                "                        \"name\": \"Cincinnati, OH (C036)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8387,\n" +
                "                        \"name\": \"DHL\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8482,\n" +
                "                        \"name\": \"CIP\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8484,\n" +
                "                        \"name\": \"M&M American\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8543,\n" +
                "                        \"name\": \"Erlanger, KY (C096)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8585,\n" +
                "                        \"name\": \"Home Depot - HOMMON01\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8586,\n" +
                "                        \"name\": \"RCT Terminal Monroe (C707) - RCTMON\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9000,\n" +
                "                        \"name\": \"CVG9\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 6438,\n" +
                "                        \"name\": \"Star CINC\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9095,\n" +
                "                        \"name\": \"FEDEX KY\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9325,\n" +
                "                        \"name\": \"PTL Cincinnati OH\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9340,\n" +
                "                        \"name\": \"Averitt Erlanger (SQRW)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9350,\n" +
                "                        \"name\": \"PL Cleves OH\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-08-2021 21:04:56\"\n" +
                "                },\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1435998PLA\",\n" +
                "                \"batteryPercentage\": 100.0,\n" +
                "                \"location\": \"605 N Wayne Ave, Cincinnati, OH 45215, USA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"trailerId\": 23757,\n" +
                "                \"trailerState\": \"Stopped\",\n" +
                "                \"longitude\": -84.462102\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/817385222/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/817385222/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"23757\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/817385222\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846866307\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 42.610361,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 9004,\n" +
                "                        \"name\": \"MKE5\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"1 days 19 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 08:00:47\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8301,\n" +
                "                        \"name\": \"MKE - Forward Air (196177)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8767,\n" +
                "                        \"name\": \"MDW8\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"roadReadyDate\": \"12-15-2020 15:13:00\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1637740PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -87.94266,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 08:00:47\"\n" +
                "                },\n" +
                "                \"roadReadyStatus\": \"PASS\",\n" +
                "                \"batteryPercentage\": 96.0,\n" +
                "                \"location\": \"11121 Burlington Rd, Kenosha, WI 53144, USA\",\n" +
                "                \"trailerId\": 22269,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846866307/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846866307/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"22269\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846866307\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846870911\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 37.458499,\n" +
                "                \"powerSource\": \"Solar\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 9005,\n" +
                "                        \"name\": \"HRC9\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"91 days 05 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"04-10-2021 08:00:31\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8576,\n" +
                "                        \"name\": \"Sandston, VA (C022)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9149,\n" +
                "                        \"name\": \"RIC3\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9358,\n" +
                "                        \"name\": \"Walmart Sutherland - WALSUT01\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"roadReadyDate\": \"11-10-2020 22:58:24\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1536547PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -77.430669,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"04-10-2021 21:06:40\"\n" +
                "                },\n" +
                "                \"roadReadyStatus\": \"PASS\",\n" +
                "                \"batteryPercentage\": 85.0,\n" +
                "                \"location\": \"2000 Trenton Ave, Richmond, VA 23234, USA\",\n" +
                "                \"trailerId\": 21737,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846870911/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846870911/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"21737\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846870911\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846862209\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 41.276087,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 8760,\n" +
                "                        \"name\": \"AVP3\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 23:27:31\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 9313,\n" +
                "                        \"name\": \"Lowes Pittston PA\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1830527PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -75.500606,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-08-2021 23:29:31\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 98.0,\n" +
                "                \"location\": \"Unnamed Road, Covington Township, PA 18424, USA\",\n" +
                "                \"trailerId\": 26662,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846862209/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846862209/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"26662\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846862209\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846870539\",\n" +
                "            \"attributes\": {\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 42.837022,\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"powerSource\": \"Solar\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 12:00:40\",\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 12:00:40\"\n" +
                "                },\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1931570A\",\n" +
                "                \"batteryPercentage\": 93.0,\n" +
                "                \"location\": \"Unnamed Road, Caledonia, MI 49316, USA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"trailerId\": 26506,\n" +
                "                \"trailerState\": \"Stopped\",\n" +
                "                \"longitude\": -85.548106\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846870539/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846870539/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"26506\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846870539\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846862303\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 40.174913,\n" +
                "                \"powerSource\": \"Solar\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 9143,\n" +
                "                        \"name\": \"PHL6\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"11 days 19 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 22:07:31\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8762,\n" +
                "                        \"name\": \"XUSC\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9297,\n" +
                "                        \"name\": \"SE Mechanicsburg PA\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9333,\n" +
                "                        \"name\": \"Nestle Purina PA\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9348,\n" +
                "                        \"name\": \"PTL Carlisle PA DCC\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1536848PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -77.229844,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-08-2021 22:24:19\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 99.0,\n" +
                "                \"location\": \"1431-1545 Walnut Bottom Rd, Carlisle, PA 17015, USA\",\n" +
                "                \"trailerId\": 28042,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846862303/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846862303/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"28042\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846862303\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846871104\",\n" +
                "            \"attributes\": {\n" +
                "                \"motionStatus\": \"In Motion\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 40.176488,\n" +
                "                \"landmarkTrailerState\": \"InMotion\",\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"55 mph\",\n" +
                "                \"lastPingDate\": \"07-09-2021 05:52:54\",\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-09-2021 05:52:54\"\n" +
                "                },\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1637749PLA\",\n" +
                "                \"batteryPercentage\": 98.0,\n" +
                "                \"location\": \"Pennsylvania Turnpike, Morgantown, PA 19543, USA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"trailerId\": 21724,\n" +
                "                \"trailerState\": \"Stopped\",\n" +
                "                \"longitude\": -75.924866\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846871104/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846871104/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"21724\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846871104\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846870415\",\n" +
                "            \"attributes\": {\n" +
                "                \"motionStatus\": \"In Motion\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 31.153252,\n" +
                "                \"landmarkTrailerState\": \"InMotion\",\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"72 mph\",\n" +
                "                \"lastPingDate\": \"07-09-2021 05:42:47\",\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-09-2021 05:42:47\"\n" +
                "                },\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1830549PLA\",\n" +
                "                \"batteryPercentage\": 98.0,\n" +
                "                \"location\": \"I-10, Sierra Blanca, TX 79851, USA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"trailerId\": 26715,\n" +
                "                \"trailerState\": \"Stopped\",\n" +
                "                \"longitude\": -105.282487\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846870415/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846870415/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"26715\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846870415\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"824416689\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 39.599687,\n" +
                "                \"powerSource\": \"Solar\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 9386,\n" +
                "                        \"name\": \"IND9\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"11 days 21 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 08:00:32\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 9389,\n" +
                "                        \"name\": \"MQJ2\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8438,\n" +
                "                        \"name\": \"Indianapolis, IN (C045)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8473,\n" +
                "                        \"name\": \"IND - Walmart/Pilot (176622)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8507,\n" +
                "                        \"name\": \"INM - INMPLA\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8684,\n" +
                "                        \"name\": \"Prime Distribution - PRIPLA\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8920,\n" +
                "                        \"name\": \"Prime Distribution - PRIPLA01\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9324,\n" +
                "                        \"name\": \"DAFG IN (SQGW)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9222,\n" +
                "                        \"name\": \"Target Distribution Center - TARIND\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1537089PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -86.059643,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-08-2021 19:40:53\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 97.0,\n" +
                "                \"location\": \"1241 S Graham Rd, Greenwood, IN 46143, USA\",\n" +
                "                \"trailerId\": 20589,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/824416689/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/824416689/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"20589\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/824416689\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846862166\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 37.459453,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 9005,\n" +
                "                        \"name\": \"HRC9\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"1 days 17 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-09-2021 00:33:19\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 9358,\n" +
                "                        \"name\": \"Walmart Sutherland - WALSUT01\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8576,\n" +
                "                        \"name\": \"Sandston, VA (C022)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9149,\n" +
                "                        \"name\": \"RIC3\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1830605PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -77.430527,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-09-2021 01:00:31\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 97.0,\n" +
                "                \"location\": \"2000 Trenton Ave, Richmond, VA 23234, USA\",\n" +
                "                \"trailerId\": 26720,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846862166/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846862166/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"26720\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846862166\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846862013\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 34.130142,\n" +
                "                \"powerSource\": \"Solar\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 9141,\n" +
                "                        \"name\": \"LGB8\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 19:13:31\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8481,\n" +
                "                        \"name\": \"UPS CA\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8750,\n" +
                "                        \"name\": \"ONT5\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8992,\n" +
                "                        \"name\": \"LAX9\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8996,\n" +
                "                        \"name\": \"ONT8\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9144,\n" +
                "                        \"name\": \"XLX2\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9157,\n" +
                "                        \"name\": \"HLA9\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1638252PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -117.407082,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"sensorType\": \"Motion\",\n" +
                "                    \"sensorData\": \"Stop\",\n" +
                "                    \"messageDate\": \"07-08-2021 20:27:31\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 100.0,\n" +
                "                \"location\": \"1595 N Linden Ave, Rialto, CA 92376, USA\",\n" +
                "                \"trailerId\": 28761,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846862013/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846862013/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"28761\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846862013\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"824737468\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 39.764652,\n" +
                "                \"powerSource\": \"Solar\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 22:00:31\",\n" +
                "                \"landmarksNear\": [\n" +
                "                    {\n" +
                "                        \"id\": 8280,\n" +
                "                        \"name\": \"PHL - Forward Air (5794)\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8478,\n" +
                "                        \"name\": \"UPS NJ\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 8608,\n" +
                "                        \"name\": \"Pratt - Elmer\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 9003,\n" +
                "                        \"name\": \"ACY1\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"roadReadyDate\": \"01-22-2021 20:54:14\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1335762PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -75.360134,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 22:00:31\"\n" +
                "                },\n" +
                "                \"roadReadyStatus\": \"PASS\",\n" +
                "                \"batteryPercentage\": 98.0,\n" +
                "                \"location\": \"Center Square Rd & I-295 & County Rd 620, Logan Township, NJ 08085, USA\",\n" +
                "                \"trailerId\": 24810\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/824737468/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/824737468/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"24810\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/824737468\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"trailer_states\",\n" +
                "            \"id\": \"846871005\",\n" +
                "            \"attributes\": {\n" +
                "                \"distance\": \"0 mi\",\n" +
                "                \"latitude\": 43.602471,\n" +
                "                \"powerSource\": \"Battery\",\n" +
                "                \"landmarks\": [\n" +
                "                    {\n" +
                "                        \"id\": 8749,\n" +
                "                        \"name\": \"BOI2\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"idleTime\": \"1 days 13 hours\",\n" +
                "                \"speed\": \"0 mph\",\n" +
                "                \"lastPingDate\": \"07-08-2021 08:00:31\",\n" +
                "                \"batteryState\": \"High\",\n" +
                "                \"useHeatIndex\": false,\n" +
                "                \"trailerName\": \"1536550PLA\",\n" +
                "                \"sensorsState\": {},\n" +
                "                \"longitude\": -116.494988,\n" +
                "                \"motionStatus\": \"Stopped\",\n" +
                "                \"trailerAlerts\": {},\n" +
                "                \"landmarkTrailerState\": \"Stopped\",\n" +
                "                \"noOfAxle\": 0,\n" +
                "                \"groups\": [\n" +
                "                    {\n" +
                "                        \"name\": \"SL-CARGOPRIME\",\n" +
                "                        \"fleet\": false\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"trailerTires\": [],\n" +
                "                \"noOfStemcoAxle\": 0,\n" +
                "                \"lodsSelfCanceled\": 0,\n" +
                "                \"lastEvent\": {\n" +
                "                    \"messageDate\": \"07-08-2021 08:00:31\"\n" +
                "                },\n" +
                "                \"batteryPercentage\": 98.0,\n" +
                "                \"location\": \"15948 Robinson Rd, Nampa, ID 83687, USA\",\n" +
                "                \"trailerId\": 21812,\n" +
                "                \"trailerState\": \"Stopped\"\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"trailer\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"/trailer_states/846871005/relationships/trailer\",\n" +
                "                        \"related\": \"/trailer_states/846871005/trailer\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"trailers\",\n" +
                "                        \"id\": \"21812\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"/trailer_states/846871005\"\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"included\": [],\n" +
                "    \"meta\": {\n" +
                "        \"resourceCount\": 35\n" +
                "    }\n" +
                "}";






    }

    private static Trailer objectMapper2(String responseEntity) {

        JSONObject jsonObject = new JSONObject(responseEntity.trim());
        Iterator<String> keys = jsonObject.keys();

        while (keys.hasNext()) {
            String key = keys.next();

            if(key.equals("data")) {

                JSONArray jsonArray =  (JSONArray) jsonObject.get("data");
                Iterator<Object> iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                    JSONObject next = (JSONObject) iterator.next();

                    Iterator<String> keys2 = next.keys();
                    while (keys2.hasNext()) {
                        String kk = keys2.next();
                        if(kk.equals("attributes")) {
                            JSONObject jsonObject2 = next.getJSONObject(kk);
                            Iterator<String> keys22 = jsonObject2.keys();
                        }


                    }


                }
            }

        }




        return new Trailer();
    }


}
